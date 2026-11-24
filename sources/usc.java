// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class usc extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static usc a(double d, double d2, long j, int i2, int i3, int i4, int i5) {
        usc uscVar = new usc();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        uscVar.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i2;
        tL_inputWebFileGeoPointLocation.h = i3;
        tL_inputWebFileGeoPointLocation.zoom = i4;
        tL_inputWebFileGeoPointLocation.scale = i5;
        uscVar.e = "image/png";
        uscVar.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        uscVar.c = new ArrayList();
        return uscVar;
    }

    public static usc b(TLRPC.GeoPoint geoPoint, int i2, int i3, int i4, int i5) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i2, i3, i4, i5);
    }

    public static usc c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            usc uscVar = new usc();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            uscVar.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            uscVar.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            uscVar.d = tL_webDocument.size;
            uscVar.e = tL_webDocument.mime_type;
            uscVar.c = tL_webDocument.attributes;
            return uscVar;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        usc uscVar2 = new usc();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        uscVar2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        uscVar2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        uscVar2.d = tL_webDocumentNoProxy.size;
        uscVar2.e = tL_webDocumentNoProxy.mime_type;
        uscVar2.c = tL_webDocumentNoProxy.attributes;
        uscVar2.f = true;
        return uscVar2;
    }
}
