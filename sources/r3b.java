// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r3b extends Drawable {
    public final int a;
    public final int b;
    public final wl[] c;
    public final boolean e;
    public int d = jn7.d4;
    public final RectF f = new RectF();
    public boolean g = false;

    public r3b(int i, ArrayList arrayList, boolean z) {
        this.e = z;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new wl[min];
        if (!arrayList.isEmpty()) {
            r47.H2((TLRPC.Document) arrayList.get(0));
        }
        int i2 = max < 2 ? 1 : 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = wl.l(i, i2, (TLRPC.Document) arrayList.get(i3));
        }
    }

    public final void a(wb2 wb2Var) {
        for (int i = 0; i < this.b; i++) {
            this.c[i].o(wb2Var);
        }
    }

    public final boolean b(ArrayList arrayList) {
        wl[] wlVarArr = this.c;
        if (wlVarArr.length == arrayList.size()) {
            for (int i = 0; i < wlVarArr.length; i++) {
                TLRPC.Document document = wlVarArr[i].e;
                if ((document == null ? 0L : document.id) == ((TLRPC.Document) arrayList.get(i)).id) {
                }
            }
            return true;
        }
        return false;
    }

    public final void c() {
        this.g = false;
    }

    public final void d() {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        wl wlVar;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (hl.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (hl.L(48.0f) / 2.0f);
        int L = hl.L(48.0f);
        int i = this.a;
        float f = L / i;
        float L2 = hl.L(48.0f) / i;
        canvas.save();
        canvas.clipRect(centerX, centerY, hl.L(48.0f) + centerX, hl.L(48.0f) + centerY);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i2 * i) + i3;
                if (i4 >= 0) {
                    wl[] wlVarArr = this.c;
                    if (i4 < wlVarArr.length && (wlVar = wlVarArr[i4]) != null) {
                        wlVar.setBounds((int) ((i3 * f) + centerX), (int) ((i2 * L2) + centerY), (int) (((i3 + 1) * f) + centerX), (int) (((i2 + 1) * L2) + centerY));
                        wlVarArr[i4].setAlpha(this.d);
                        wlVarArr[i4].setColorFilter(this.e ? aob.w3 : aob.v3);
                        wlVarArr[i4].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return hl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
