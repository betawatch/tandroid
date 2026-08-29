package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f extends View implements x5 {
    public lg.b a;
    public lg.b b;
    public int c;
    public int d;
    public qg.c e;
    public int f;

    public f(Context context) {
        super(context);
    }

    public final void a() {
        this.a.setBounds(0, 0, getMeasuredWidth(), this.c);
        this.b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void b(lg.a aVar, og.d dVar) {
        ng.d c3 = aVar.c(this, null, false);
        c3.n(dVar);
        lg.b bVar = new lg.b(c3);
        this.a = bVar;
        bVar.b(-AndroidUtilities.dp(30.0f), true);
        ng.d c6 = aVar.c(this, null, false);
        c6.n(dVar);
        lg.b bVar2 = new lg.b(c6);
        this.b = bVar2;
        bVar2.b(AndroidUtilities.dp(30.0f), true);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10;
        qg.c cVar = this.e;
        if (cVar == null || (i10 = this.f) == -1) {
            return;
        }
        cVar.a(g6.w0(null, i10, false));
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        lg.b bVar = this.a;
        if (bVar.q != i10) {
            bVar.q = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.c != i10) {
            this.c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.a.p = z10;
        this.b.p = z10;
    }

    public void setup(lg.a aVar) {
        b(aVar, null);
    }

    public void setupColorKey(int i10) {
        this.f = i10;
        if (this.e == null) {
            qg.c cVar = new qg.c();
            this.e = cVar;
            cVar.a(g6.w0(null, i10, false));
            setup(new lg.a(this.e));
        }
    }
}
