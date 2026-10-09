package qf;

import ai.v2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.f4;
import com.google.firebase.messaging.n;
import i2.f0;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;
import w7.o;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e {
    public static int n;
    public static final Rect o = new Rect();
    public final n a;
    public final sf.e b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final sf.a g;
    public final tf.b h;
    public final oi.f i;
    public View j;
    public View k;
    public f0 l;
    public boolean m;

    public e(n nVar, d dVar) {
        int i10 = n;
        n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        oi.f fVar = new oi.f();
        fVar.d = new v2(fVar, 11);
        fVar.a = f4Var;
        this.i = fVar;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.c = sb3;
        this.g = dVar.b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f = dVar.f;
        this.a = nVar;
        bVar.c(dVar.h, dVar.i);
        this.l = dVar.g;
        this.k = dVar.k;
        this.b = new sf.e(this);
        View view = dVar.j;
        fVar.P(view);
        this.j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.a).put(sb3, this);
        nVar.I();
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
        boolean z11 = this.h.b() && this.g.g();
        if (this.m != z11) {
            this.m = z11;
            if (z10) {
                n nVar = this.a;
                nVar.I();
                ((a) nVar.c).invalidate();
            }
        }
    }

    public final void c() {
        this.i.P(null);
        n nVar = this.a;
        if (((HashMap) nVar.a).remove(this.c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.a.n(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view) {
        boolean c10;
        n nVar = this.a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) nVar.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) nVar.d;
        int[] iArr = tf.c.a;
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
        int b10 = o.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int b11 = o.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int b12 = o.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int b13 = o.b(height, i17, decorView.getHeight() + i17);
        Rect rect = o;
        rect.set(b10, b11, b12, b13);
        tf.b bVar = this.h;
        Rect rect2 = bVar.a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                c10 = bVar.c(view.getWidth(), view.getHeight());
            }
            if (z10) {
                return;
            }
            b(true);
            nVar.n(this);
            return;
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        c10 = bVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= c10;
        if (z10) {
        }
    }
}
