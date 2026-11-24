// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vuc extends TLObject {
    public static final /* synthetic */ int i = 0;
    public String a;
    public TLRPC.InputWebFileLocation b;
    public ArrayList c;
    public int d;
    public String e;
    public boolean f;

    public static vuc a(double d, double d2, long j, int i2, int i3, int i4, int i5) {
        vuc vucVar = new vuc();
        TLRPC.TL_inputWebFileGeoPointLocation tL_inputWebFileGeoPointLocation = new TLRPC.TL_inputWebFileGeoPointLocation();
        vucVar.b = tL_inputWebFileGeoPointLocation;
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputWebFileGeoPointLocation.geo_point = tL_inputGeoPoint;
        tL_inputWebFileGeoPointLocation.access_hash = j;
        tL_inputGeoPoint.lat = d;
        tL_inputGeoPoint._long = d2;
        tL_inputWebFileGeoPointLocation.w = i2;
        tL_inputWebFileGeoPointLocation.h = i3;
        tL_inputWebFileGeoPointLocation.zoom = i4;
        tL_inputWebFileGeoPointLocation.scale = i5;
        vucVar.e = "image/png";
        vucVar.a = String.format(Locale.US, "maps_%.6f_%.6f_%d_%d_%d_%d.png", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        vucVar.c = new ArrayList();
        return vucVar;
    }

    public static vuc b(TLRPC.GeoPoint geoPoint, int i2, int i3, int i4, int i5) {
        return a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, i2, i3, i4, i5);
    }

    public static vuc c(TLRPC.WebDocument webDocument) {
        if (webDocument instanceof TLRPC.TL_webDocument) {
            vuc vucVar = new vuc();
            TLRPC.TL_webDocument tL_webDocument = (TLRPC.TL_webDocument) webDocument;
            TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation = new TLRPC.TL_inputWebFileLocation();
            vucVar.b = tL_inputWebFileLocation;
            String str = webDocument.url;
            vucVar.a = str;
            tL_inputWebFileLocation.url = str;
            tL_inputWebFileLocation.access_hash = tL_webDocument.access_hash;
            vucVar.d = tL_webDocument.size;
            vucVar.e = tL_webDocument.mime_type;
            vucVar.c = tL_webDocument.attributes;
            return vucVar;
        }
        if (!(webDocument instanceof TLRPC.TL_webDocumentNoProxy)) {
            return null;
        }
        vuc vucVar2 = new vuc();
        TLRPC.TL_webDocumentNoProxy tL_webDocumentNoProxy = (TLRPC.TL_webDocumentNoProxy) webDocument;
        TLRPC.TL_inputWebFileLocation tL_inputWebFileLocation2 = new TLRPC.TL_inputWebFileLocation();
        vucVar2.b = tL_inputWebFileLocation2;
        String str2 = webDocument.url;
        vucVar2.a = str2;
        tL_inputWebFileLocation2.url = str2;
        tL_inputWebFileLocation2.access_hash = tL_webDocumentNoProxy.access_hash;
        vucVar2.d = tL_webDocumentNoProxy.size;
        vucVar2.e = tL_webDocumentNoProxy.mime_type;
        vucVar2.c = tL_webDocumentNoProxy.attributes;
        vucVar2.f = true;
        return vucVar2;
    }
}
