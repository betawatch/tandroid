package xe;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.t;
import g7.n;
import h3.k0;
import java.util.HashMap;
import kh.z3;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public static int n;
    public static final Rect o = new Rect();
    public final t3 a;
    public final ze.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final ze.a g;
    public final af.c h;
    public final t i;
    public View j;
    public View k;
    public k0 l;
    public boolean m;

    public d(t3 t3Var, c cVar) {
        int i9 = n;
        n = i9 + 1;
        af.c cVar2 = new af.c();
        this.h = cVar2;
        t tVar = new t(new z3(this, 1));
        this.i = tVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i9);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = cVar.b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f = cVar.f;
        this.a = t3Var;
        cVar2.c(cVar.h, cVar.i);
        this.l = cVar.g;
        this.k = cVar.k;
        this.b = new ze.e(this);
        View view = cVar.j;
        tVar.O(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) t3Var.a).put(sb3, this);
        t3Var.g();
    }

    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            a2.setAutoEnterEnabled(i9 >= 31);
        }
        return a2.build();
    }

    public final void b(boolean z10) {
        boolean z11 = this.h.b() && this.g.f();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                t3 t3Var = this.a;
                t3Var.g();
                ((a) t3Var.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.O(null);
        t3 t3Var = this.a;
        if (((HashMap) t3Var.a).remove(this.c) != null) {
            t3Var.g();
        }
    }

    public final void d(int i9, int i10) {
        if (this.h.c(i9, i10)) {
            b(true);
            this.a.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean c10;
        t3 t3Var = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) t3Var.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) t3Var.d;
        int[] iArr = af.d.a;
        view.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i9 = iArr[0];
        int i10 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i11 = i9 - iArr[0];
        int i12 = i10 - iArr[1];
        int width = view.getWidth() + i11;
        int height = view.getHeight() + i12;
        int i13 = iArr[0];
        int b10 = n.b(i11, i13, decorView.getWidth() + i13);
        int i14 = iArr[1];
        int b11 = n.b(i12, i14, decorView.getHeight() + i14);
        int i15 = iArr[0];
        int b12 = n.b(width, i15, decorView.getWidth() + i15);
        int i16 = iArr[1];
        int b13 = n.b(height, i16, decorView.getHeight() + i16);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        af.c cVar = this.h;
        Rect rect2 = cVar.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                c10 = cVar.c(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            t3Var.a(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        c10 = cVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= c10;
        if (z10) {
        }
    }
}
