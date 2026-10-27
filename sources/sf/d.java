package sf;

import a8.ee;
import aa.m0;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import bi.i6;
import com.google.firebase.messaging.q;
import fi.x3;
import i2.j0;
import java.util.HashMap;
import k2.o0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d {
    public static int n;
    public static final Rect o = new Rect();
    public final m0 a;
    public final uf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final uf.a g;
    public final o0 h;
    public final q i;
    public View j;
    public View k;
    public j0 l;
    public boolean m;

    public d(m0 m0Var, c cVar) {
        int i10 = n;
        n = i10 + 1;
        o0 o0Var = new o0();
        this.h = o0Var;
        x3 x3Var = new x3(this, 1);
        q qVar = new q();
        qVar.d = new i6(qVar, 13);
        qVar.a = x3Var;
        this.i = qVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = cVar.b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f = cVar.f;
        this.a = m0Var;
        o0Var.d(cVar.h, cVar.i);
        this.l = cVar.g;
        this.k = cVar.k;
        this.b = new uf.e(this);
        View view = cVar.j;
        qVar.D(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) m0Var.a).put(sb3, this);
        m0Var.E();
    }

    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            a2.setAutoEnterEnabled(i10 >= 31);
        }
        return a2.build();
    }

    public final void b(boolean z10) {
        boolean z11 = this.h.c() && this.g.g();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                m0 m0Var = this.a;
                m0Var.E();
                ((a) m0Var.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.D(null);
        m0 m0Var = this.a;
        if (((HashMap) m0Var.a).remove(this.c) != null) {
            m0Var.E();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.a.l(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean d;
        m0 m0Var = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) m0Var.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) m0Var.d;
        int[] iArr = vf.b.a;
        view.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int width = view.getWidth() + i12;
        int height = view.getHeight() + i13;
        int i14 = iArr[0];
        int b10 = ee.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = ee.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = ee.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = ee.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        o0 o0Var = this.h;
        Rect rect2 = (Rect) o0Var.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                d = o0Var.d(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            m0Var.l(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        d = o0Var.d(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= d;
        if (z10) {
        }
    }
}
