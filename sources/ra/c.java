package ra;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(d dVar, int i3) {
        this.a = i3;
        this.b = dVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        d dVar = this.b;
        synchronized (dVar) {
            try {
                i iVar = (i) dVar.a.get();
                ArrayList b10 = iVar.b();
                iVar.a();
                JSONArray jSONArray = new JSONArray();
                for (int i3 = 0; i3 < b10.size(); i3++) {
                    a aVar = (a) b10.get(i3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                d dVar = this.b;
                synchronized (dVar) {
                    ((i) dVar.a.get()).i(System.currentTimeMillis(), ((bb.b) dVar.c.get()).a());
                }
                return null;
        }
    }
}
