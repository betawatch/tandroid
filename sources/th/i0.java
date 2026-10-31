package th;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 {
    public int a;
    public long b;
    public int c;
    public long d;
    public int e;
    public ArrayList f;

    public final float a() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = currentTime;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            h0 h0Var = (h0) obj;
            if (h0Var.g > 0) {
                i10 = Math.min(i10, h0Var.d);
                i11 = Math.max(i11, o.b(this.a, (int) h0Var.g, 0) + h0Var.d);
            }
        }
        Typeface typeface = org.telegram.messenger.i0.a;
        return (currentTime - i11) / (i10 - i11);
    }

    public final int b() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h0 h0Var = (h0) obj;
            long j10 = h0Var.g;
            if (j10 > 0 && currentTime - h0Var.d <= o.b(this.a, (int) j10, 0)) {
                i10 += (int) h0Var.g;
            }
        }
        this.d = Math.max(this.d, i10);
        return i10;
    }

    public final void c() {
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (h0Var.g > 0) {
                currentTime = Math.min(currentTime, h0Var.d);
            }
        }
        this.c = currentTime;
    }
}
