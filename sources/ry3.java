// default package

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ry3 extends yr3 {
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final /* synthetic */ sy3 Q;

    public ry3(sy3 sy3Var) {
        this.Q = sy3Var;
    }

    @Override // yr3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return;
        }
        boolean z = true;
        boolean z2 = arrayList.size() <= 3 || gda.o() == 0;
        if (!z2) {
            for (int i3 = 0; i3 < this.O.size(); i3++) {
                ty3 ty3Var = (ty3) this.O.get(i3);
                if (ty3Var.e != 0.0f || ty3Var.d != null || ty3Var.getTranslationX() != 0.0f || ty3Var.getTranslationY() != 0.0f || ty3Var.getAlpha() != 1.0f) {
                    break;
                }
            }
        }
        z = z2;
        if (!z) {
            super.a(canvas, j, i, i2, 1.0f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, 1.0f);
        k();
    }

    @Override // yr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i >= arrayList.size()) {
                return;
            }
            ty3 ty3Var = (ty3) arrayList.get(i);
            ty3Var.b.h(canvas, ty3Var.a[this.L]);
            i++;
        }
    }

    @Override // yr3
    public final void d(Canvas canvas, float f) {
        vm vmVar;
        if (this.O != null) {
            for (int i = 0; i < this.O.size(); i++) {
                ty3 ty3Var = (ty3) this.O.get(i);
                gn gnVar = ty3Var.c;
                if (gnVar != null && (vmVar = (vm) this.Q.E.l1.get(gnVar.getDocumentId())) != null && vmVar.k != null && ty3Var.b != null) {
                    vmVar.setAlpha((int) (ty3Var.getAlpha() * 255.0f * f));
                    float width = ((ty3Var.getWidth() - ty3Var.getPaddingLeft()) - ty3Var.getPaddingRight()) / 2.0f;
                    float height = ((ty3Var.getHeight() - ty3Var.getPaddingTop()) - ty3Var.getPaddingBottom()) / 2.0f;
                    float right = (ty3Var.getRight() + ty3Var.getLeft()) / 2.0f;
                    float paddingTop = ty3Var.getPaddingTop() + height;
                    float f2 = ty3Var.e;
                    float f3 = f2 != 0.0f ? 1.0f * (((1.0f - f2) * 0.2f) + 0.8f) : 1.0f;
                    vmVar.setBounds((int) (right - ((ty3Var.getScaleX() * width) * f3)), (int) (paddingTop - ((ty3Var.getScaleY() * height) * f3)), (int) ((ty3Var.getScaleX() * width * f3) + right), (int) ((ty3Var.getScaleY() * height * f3) + paddingTop));
                    vmVar.draw(canvas);
                }
            }
        }
    }

    @Override // yr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i >= arrayList.size()) {
                az3 az3Var = this.Q.E;
                Pattern pattern = az3.P1;
                az3Var.b.invalidate();
                return;
            }
            ((ty3) arrayList.get(i)).a[this.L].a();
            i++;
        }
    }

    @Override // yr3
    public final void i(long j) {
        vm vmVar;
        PorterDuffColorFilter porterDuffColorFilter;
        az3 az3Var = this.Q.E;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i = 0; i < this.O.size(); i++) {
            ty3 ty3Var = (ty3) this.O.get(i);
            gn gnVar = ty3Var.c;
            in5[] in5VarArr = ty3Var.a;
            if (gnVar != null && (vmVar = (vm) az3Var.l1.get(gnVar.getDocumentId())) != null && vmVar.k != null) {
                vmVar.s(j);
                mm mmVar = vmVar.k;
                int i2 = this.L;
                in5 Q = mmVar.Q(in5VarArr[i2], i2);
                in5VarArr[i2] = Q;
                Q.c = j;
                vmVar.setAlpha(nm7.d4);
                Rect rect = gm.Q;
                rect.set(ty3Var.getPaddingLeft() + ty3Var.getLeft(), ty3Var.getPaddingTop(), ty3Var.getRight() - ty3Var.getPaddingRight(), ty3Var.getMeasuredHeight() - ty3Var.getPaddingBottom());
                in5VarArr[i2].b(rect);
                int v0 = cmb.v0(cmb.F6, az3Var.J0);
                if (v0 != az3Var.O1 || (porterDuffColorFilter = az3Var.N1) == null) {
                    az3Var.O1 = v0;
                    porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
                    az3Var.N1 = porterDuffColorFilter;
                }
                vmVar.setColorFilter(porterDuffColorFilter);
                ty3Var.b = vmVar.k;
                arrayList.add(ty3Var);
            }
        }
    }
}
