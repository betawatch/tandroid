// default package

import android.animation.ObjectAnimator;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qm {
    public static final pm h = new pm("progress", (byte) 0);
    public final TextPaint c;
    public ObjectAnimator d;
    public final gb2 g;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public float e = 0.0f;
    public int f = 1;

    public qm(gb2 gb2Var, TextPaint textPaint) {
        this.c = textPaint;
        this.g = gb2Var;
    }

    public final int a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += ((StaticLayout) arrayList.get(i)).getLineWidth(0);
        }
        return (int) Math.ceil(f);
    }

    public final void b(int i, boolean z) {
        float f;
        ArrayList arrayList;
        int i2 = this.f;
        ArrayList arrayList2 = this.a;
        if (i2 != i || arrayList2.isEmpty()) {
            ObjectAnimator objectAnimator = this.d;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.d = null;
            }
            ArrayList arrayList3 = this.b;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            arrayList2.clear();
            Locale locale = Locale.US;
            String valueOf = String.valueOf(this.f);
            String valueOf2 = String.valueOf(i);
            boolean z2 = i > this.f;
            this.f = i;
            float f2 = 0.0f;
            this.e = 0.0f;
            int i3 = 0;
            while (i3 < valueOf2.length()) {
                int i4 = i3 + 1;
                String substring = valueOf2.substring(i3, i4);
                String substring2 = (arrayList3.isEmpty() || i3 >= valueOf.length()) ? null : valueOf.substring(i3, i4);
                if (substring2 == null || !substring2.equals(substring)) {
                    f = f2;
                    arrayList = arrayList3;
                    arrayList2.add(new StaticLayout(substring, this.c, (int) Math.ceil(r14.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    arrayList2.add((StaticLayout) arrayList3.get(i3));
                    arrayList3.set(i3, null);
                    f = f2;
                    arrayList = arrayList3;
                }
                f2 = f;
                i3 = i4;
                arrayList3 = arrayList;
            }
            float f3 = f2;
            ArrayList arrayList4 = arrayList3;
            if (z && !arrayList4.isEmpty()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, h, z2 ? -1.0f : 1.0f, f3);
                this.d = ofFloat;
                ofFloat.setDuration(150L);
                this.d.addListener(new g0(this, (byte) 7));
                this.d.start();
            }
            this.g.invalidate();
        }
    }
}
