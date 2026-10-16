package rf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.s;
import di.f4;
import i2.h0;
import java.util.HashMap;
import k2.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;
import w7.r;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d {
    public static int n;
    public static final Rect o = new Rect();
    public final m a;
    public final tf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final tf.a g;
    public final m0 h;
    public final s i;
    public View j;
    public View k;
    public h0 l;
    public boolean m;

    public d(m mVar, c cVar) {
        int i10 = n;
        n = i10 + 1;
        m0 m0Var = new m0();
        this.h = m0Var;
        s sVar = new s(new f4(this, 1));
        this.i = sVar;
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
        this.a = mVar;
        m0Var.d(cVar.h, cVar.i);
        this.l = cVar.g;
        this.k = cVar.k;
        this.b = new tf.e(this);
        View view = cVar.j;
        sVar.t(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) mVar.a).put(sb3, this);
        mVar.I();
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
                m mVar = this.a;
                mVar.I();
                ((a) mVar.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.t(null);
        m mVar = this.a;
        if (((HashMap) mVar.a).remove(this.c) != null) {
            mVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.a.n(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean d;
        m mVar = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) mVar.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) mVar.d;
        int[] iArr = uf.b.a;
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
        int b10 = r.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = r.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = r.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = r.b(height, i17, decorView.getHeight() + i17);
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
            mVar.n(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        d = m0Var.d(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= d;
        if (z10) {
        }
    }
}
