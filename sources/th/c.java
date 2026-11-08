package th;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.t0;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c extends sh.c {
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;
    public final String f;
    public final Drawable h;
    public final StaticLayout n;

    public c(String str) {
        long j3;
        this.b = str;
        this.c = null;
        File file = new File(str);
        try {
            j3 = file.length();
        } catch (Throwable unused) {
            j3 = 0;
        }
        this.e = j3;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str2;
        int m12 = g0.m1(name, false);
        if (m12 != 0) {
            this.h = t0.b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (TextUtils.isEmpty(str2)) {
            this.n = null;
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(g0.L(13.0f));
        textPaint.setTypeface(g0.o());
        textPaint.setColor(k6.x0(null, k6.pj, false));
        this.n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, ij ijVar) {
        b bVar = new b();
        bVar.a.setColor(k6.x0(null, k6.G6, false));
        bVar.b.setColor(k6.x0(null, k6.y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.c = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(21.0f));
        bVar.c.g(k6.We, k6.Xe, k6.id, k6.jd);
        if (ij.K3(document)) {
            if (ij.X2(document)) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                bVar.c.j(w7.w(document.thumbs, g0.L(44.0f), true, w10, true), w10, document, ijVar);
            } else {
                String t02 = ij.t0(document, true);
                if (TextUtils.isEmpty(t02)) {
                    bVar.c.i(null, null, null);
                } else {
                    bVar.c.h(t02);
                }
            }
            bVar.c.setIcon(0, false, false);
        } else {
            bVar.c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f = str2;
        bVar.m = -1;
        bVar.g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i7, i10);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i7 - g0.L(34.0f)) / 2.0f, g0.L(15.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.b = null;
        this.c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str;
        this.e = 0L;
        int m12 = g0.m1(A, false);
        if (m12 != 0) {
            this.h = t0.b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(g0.L(13.0f));
            textPaint.setTypeface(g0.o());
            textPaint.setColor(k6.x0(null, k6.pj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str, textPaint, g0.L(34.0f), TextUtils.TruncateAt.END), textPaint, g0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }
}
