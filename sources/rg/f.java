package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f extends View implements w5 {
    public ig.b a;
    public ig.b b;
    public int c;
    public int d;
    public ng.c e;
    public int f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(ig.a aVar, lg.d dVar) {
        kg.d c10 = aVar.c(this, null, false);
        c10.n(dVar);
        ig.b bVar = new ig.b(c10);
        this.a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        kg.d c11 = aVar.c(this, null, false);
        c11.n(dVar);
        ig.b bVar2 = new ig.b(c11);
        this.b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9;
        ng.c cVar = this.e;
        if (cVar == null || (i9 = this.f) == -1) {
            return;
        }
        cVar.a(f6.w0(null, i9, false));
        invalidate();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i9) {
        this.b.b(i9, true);
    }

    public void setFadeHeightTop(int i9) {
        this.a.b(-i9, true);
    }

    public void setFadeTopAlpha(int i9) {
        ig.b bVar = this.a;
        if (bVar.q != i9) {
            bVar.q = i9;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i9) {
        if (this.d != i9) {
            this.d = i9;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i9) {
        if (this.c != i9) {
            this.c = i9;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.a.p = z10;
        this.b.p = z10;
    }

    public void setup(ig.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i9) {
        this.f = i9;
        if (this.e == null) {
            ng.c cVar = new ng.c();
            this.e = cVar;
            cVar.a(f6.w0(null, i9, false));
            setup(new ig.a(this.e));
        }
    }
}
