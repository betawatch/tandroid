package sa;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i7) {
        this.a = i7;
        this.b = cVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        c cVar = this.b;
        synchronized (cVar) {
            try {
                h hVar = (h) cVar.a.get();
                ArrayList b10 = hVar.b();
                hVar.a();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < b10.size(); i7++) {
                    a aVar = (a) b10.get(i7);
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
                c cVar = this.b;
                synchronized (cVar) {
                    ((h) cVar.a.get()).i(System.currentTimeMillis(), ((cb.b) cVar.c.get()).a());
                }
                return null;
        }
    }
}
