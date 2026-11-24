// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tza extends Drawable {
    public final int a;
    public final int b;
    public final vl[] c;
    public final boolean e;
    public int d = kk7.d4;
    public final RectF f = new RectF();
    public boolean g = false;

    public tza(int i, ArrayList arrayList, boolean z) {
        this.e = z;
        int max = (int) Math.max(1.0d, Math.sqrt(arrayList.size()));
        this.a = max;
        int min = Math.min(max * max, arrayList.size());
        this.b = min;
        this.c = new vl[min];
        if (!arrayList.isEmpty()) {
            k27.H2((TLRPC.Document) arrayList.get(0));
        }
        int i2 = max < 2 ? 1 : 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = vl.l(i, i2, (TLRPC.Document) arrayList.get(i3));
        }
    }

    public final void a(gb2 gb2Var) {
        for (int i = 0; i < this.b; i++) {
            this.c[i].o(gb2Var);
        }
    }

    public final boolean b(ArrayList arrayList) {
        vl[] vlVarArr = this.c;
        if (vlVarArr.length == arrayList.size()) {
            for (int i = 0; i < vlVarArr.length; i++) {
                TLRPC.Document document = vlVarArr[i].e;
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
        vl vlVar;
        if (this.d <= 0) {
            return;
        }
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        float centerX = rectF.centerX() - (gl.L(48.0f) / 2.0f);
        float centerY = rectF.centerY() - (gl.L(48.0f) / 2.0f);
        int L = gl.L(48.0f);
        int i = this.a;
        float f = L / i;
        float L2 = gl.L(48.0f) / i;
        canvas.save();
        canvas.clipRect(centerX, centerY, gl.L(48.0f) + centerX, gl.L(48.0f) + centerY);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (i2 * i) + i3;
                if (i4 >= 0) {
                    vl[] vlVarArr = this.c;
                    if (i4 < vlVarArr.length && (vlVar = vlVarArr[i4]) != null) {
                        vlVar.setBounds((int) ((i3 * f) + centerX), (int) ((i2 * L2) + centerY), (int) (((i3 + 1) * f) + centerX), (int) (((i2 + 1) * L2) + centerY));
                        vlVarArr[i4].setAlpha(this.d);
                        vlVarArr[i4].setColorFilter(this.e ? bkb.v3 : bkb.u3);
                        vlVarArr[i4].draw(canvas);
                    }
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(48.0f);
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
