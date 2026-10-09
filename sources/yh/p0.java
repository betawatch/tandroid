package yh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p0 extends FrameLayout implements me.d {
    public final org.telegram.ui.ActionBar.e6 a;
    public final FrameLayout b;
    public final xh.g1 c;
    public final y9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final me.b r;
    public boolean s;
    public n0 v;

    public p0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new me.b(0, this, hs.h, 320L, false);
        this.a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        xh.g1 g1Var = new xh.g1(frameLayout, e6Var, true);
        this.c = g1Var;
        frameLayout.setBackground(g1Var);
        g1Var.v = 1;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.getImageReceiver().setAutoRepeat(0);
        addView(y9Var, w7.x5.a(80.0f, 0.0f, 17.0f, 0.0f, 0.0f, 80, 49));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.x5.a(-2.0f, 12.0f, 106.0f, 12.0f, 14.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.x5.a(-2.0f, 0.0f, 10.0f, 10.0f, 0.0f, -2, 53));
    }

    public static void a(p0 p0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        y9 y9Var = p0Var.d;
        if (document == null) {
            y9Var.b();
            p0Var.n = null;
            return;
        }
        if (p0Var.n == document) {
            return;
        }
        p0Var.n = document;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.a7, 0.3f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i10);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        y9Var.setLayoutParams(w7.x5.a(i10, 0.0f, r2 + 17, 0.0f, (80 - i10) / 2, i10, 49));
        y9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
    }

    public final void b() {
        int d;
        xh.g1 g1Var = this.c;
        g1Var.x = null;
        Integer num = this.h;
        me.b bVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false), org.telegram.ui.ActionBar.i6.m1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            g1Var.x = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.a.d(bVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i10 = org.telegram.ui.ActionBar.i6.d6;
            int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.i6.G6;
            int d10 = i0.a.d(bVar.e, i0.a.d(0.05f, x02, org.telegram.ui.ActionBar.i6.x0(null, i11, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.a.center_color, 255), i0.a.k(this.v.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.i6.C1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
        b();
    }

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
