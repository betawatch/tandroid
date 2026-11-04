package uf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import b8.be;
import gi.n3;
import java.util.HashMap;
import k2.i0;
import l2.e;
import m2.m0;
import org.telegram.messenger.g0;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;
import ui.f;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public static int n;
    public static final Rect o = new Rect();
    public final e a;
    public final wf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final wf.a g;
    public final m0 h;
    public final f i;
    public View j;
    public View k;
    public i0 l;
    public boolean m;

    public d(e eVar, c cVar) {
        int i3 = n;
        n = i3 + 1;
        m0 m0Var = new m0();
        this.h = m0Var;
        f fVar = new f(new n3(this, 1));
        this.i = fVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i3);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = cVar.b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f = cVar.f;
        this.a = eVar;
        m0Var.d(cVar.h, cVar.i);
        this.l = cVar.g;
        this.k = cVar.k;
        this.b = new wf.e(this);
        View view = cVar.j;
        fVar.L(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) eVar.a).put(sb3, this);
        eVar.v();
    }

    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder a10 = this.h.a();
        a10.setActions(null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            a10.setAutoEnterEnabled(i3 >= 31);
        }
        return a10.build();
    }

    public final void b(boolean z10) {
        boolean z11 = this.h.c() && this.g.o();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                e eVar = this.a;
                eVar.v();
                ((a) eVar.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.L(null);
        e eVar = this.a;
        if (((HashMap) eVar.a).remove(this.c) != null) {
            eVar.v();
        }
    }

    public final void d(int i3, int i10) {
        if (this.h.d(i3, i10)) {
            b(true);
            this.a.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean d;
        e eVar = this.a;
        if (g0.H1((LaunchActivity) eVar.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) eVar.d;
        int[] iArr = xf.b.a;
        view.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i3 = iArr[0];
        int i10 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i11 = i3 - iArr[0];
        int i12 = i10 - iArr[1];
        int width = view.getWidth() + i11;
        int height = view.getHeight() + i12;
        int i13 = iArr[0];
        int b10 = be.b(i11, i13, decorView.getWidth() + i13);
        int i14 = iArr[1];
        int b11 = be.b(i12, i14, decorView.getHeight() + i14);
        int i15 = iArr[0];
        int b12 = be.b(width, i15, decorView.getWidth() + i15);
        int i16 = iArr[1];
        int b13 = be.b(height, i16, decorView.getHeight() + i16);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        m0 m0Var = this.h;
        Rect rect2 = (Rect) m0Var.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                d = m0Var.d(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            eVar.f(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        d = m0Var.d(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= d;
        if (z10) {
        }
    }
}
