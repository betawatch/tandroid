package yf;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Map map) {
        if (map.isEmpty()) {
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
                String str = e2.d0.a;
                JSONObject jSONObject = new JSONObject(new String(f9.b.b(open), d9.d.a));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    map.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
                }
                open.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static TLRPC.InputStorePaymentPurpose b(String str) {
        FileLog.d("BillingUtilities.getPurpose " + str);
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
        a a2 = a.a(serializedData, serializedData.readInt32(true));
        serializedData.cleanup();
        if (a2.c != null) {
            FileLog.d("BillingUtilities.getPurpose: got purpose from received obfuscated profile id");
            return a2.c;
        }
        SerializedData serializedData2 = new SerializedData(8);
        serializedData2.writeInt64(a2.b);
        String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        FileLog.d("BillingUtilities.getPurpose: searching purpose under " + bytesToHex);
        String string = ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).getString(bytesToHex, null);
        if (string == null) {
            FileLog.d("BillingUtilities.getPurpose: purpose under " + bytesToHex + " not found");
            throw new RuntimeException(a4.a.p("no purpose under ", bytesToHex, " found :("));
        }
        FileLog.d("BillingUtilities.getPurpose: got {" + string + "} under " + bytesToHex);
        SerializedData serializedData3 = new SerializedData(Utilities.hexToBytes(string));
        a a10 = a.a(serializedData3, serializedData3.readInt32(true));
        serializedData3.cleanup();
        return a10.c;
    }
}
