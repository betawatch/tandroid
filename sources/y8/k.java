package y8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.BuildConfig;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k extends l6.a {
    public final /* synthetic */ int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.e = i11;
    }

    public final String toString() {
        String str;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.a;
                int i10 = this.b;
                dataHolder.c(i10, "event_type");
                if (dataHolder.d[this.c].getInt(i10, dataHolder.c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.b;
                    dataHolder.c(i11, "event_type");
                    str = dataHolder.d[this.c].getInt(i11, dataHolder.c.getInt("event_type")) == 2 ? "deleted" : "unknown";
                }
                return p6.j("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.b, this.e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.a;
                int i12 = this.b;
                dataHolder2.c(i12, "data");
                byte[] blob = dataHolder2.d[this.c].getBlob(i12, dataHolder2.c.getInt("data"));
                int i13 = this.e;
                HashMap hashMap = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    l lVar = new l(dataHolder2, this.b + i14);
                    DataHolder dataHolder3 = lVar.a;
                    int i15 = lVar.b;
                    dataHolder3.c(i15, "asset_key");
                    if (dataHolder3.d[lVar.c].getString(i15, dataHolder3.c.getInt("asset_key")) != null) {
                        int i16 = lVar.b;
                        dataHolder3.c(i16, "asset_key");
                        hashMap.put(dataHolder3.d[lVar.c].getString(i16, dataHolder3.c.getInt("asset_key")), lVar);
                    }
                }
                StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
                int i17 = this.b;
                dataHolder2.c(i17, "path");
                sb2.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.c].getString(i17, dataHolder2.c.getInt("path"))))));
                sb2.append(", dataSz=".concat((blob == null ? BuildConfig.BETA_URL : Integer.valueOf(blob.length)).toString()));
                sb2.append(", numAssets=" + hashMap.size());
                if (isLoggable && !hashMap.isEmpty()) {
                    sb2.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb2.append(str2 + ((String) entry.getKey()) + ": " + ((x8.f) entry.getValue()).getId());
                        str2 = ", ";
                    }
                    sb2.append("]");
                }
                sb2.append(" }");
                return sb2.toString();
        }
    }
}
