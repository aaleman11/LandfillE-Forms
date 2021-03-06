package com.landfilleforms.android.landfille_forms.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.landfilleforms.android.landfille_forms.model.WarmSpotData;
import com.landfilleforms.android.landfille_forms.database.LandFillDbSchema.WarmSpotDataTable;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Work on 2/16/2017.
 */

public class WarmSpotDataCursorWrapper extends CursorWrapper{
    public WarmSpotDataCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public WarmSpotData getWarmSpotData() {
        String uuidString = getString(getColumnIndex(WarmSpotDataTable.Cols.UUID));
        String location = getString(getColumnIndex(WarmSpotDataTable.Cols.LOCATION));
        String gridId = getString(getColumnIndex(WarmSpotDataTable.Cols.GRID_ID));
        long date = getLong(getColumnIndex(WarmSpotDataTable.Cols.DATE));
        String description = getString(getColumnIndex(WarmSpotDataTable.Cols.DESCRIPTION));
        double estimatedSize = getDouble(getColumnIndex(WarmSpotDataTable.Cols.ESTIMATED_SIZE));
        String inspectorFullName = getString(getColumnIndex(WarmSpotDataTable.Cols.INSPECTOR_NAME));
        String inspectorUserName = getString(getColumnIndex(WarmSpotDataTable.Cols.INSPECTOR_USERNAME));
        double methaneReading = getDouble(getColumnIndex(WarmSpotDataTable.Cols.MAX_METHANE_READING));
        String instrumentSerialNumber = getString(getColumnIndex(WarmSpotDataTable.Cols.INSTRUMENT_SERIAL));

        WarmSpotData warmSpotData = new WarmSpotData(UUID.fromString(uuidString));
        warmSpotData.setLocation(location);
        warmSpotData.setGridId(gridId);
        warmSpotData.setDate(new Date(date));
        warmSpotData.setDescription(description);
        warmSpotData.setEstimatedSize(estimatedSize);
        warmSpotData.setInspectorFullName(inspectorFullName);
        warmSpotData.setInspectorUserName(inspectorUserName);
        warmSpotData.setMaxMethaneReading(methaneReading);
        warmSpotData.setInstrumentSerial(instrumentSerialNumber);

        return warmSpotData;
    }
}
