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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements le.d {
    public final org.telegram.ui.ActionBar.f6 a;
    public final FrameLayout b;
    public final xh.e1 c;
    public final u9 d;
    public final TextView e;
    public final TextView f;
    public Integer h;
    public TLRPC.Document n;
    public final le.b r;
    public boolean s;
    public o0 v;

    public q0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new le.b(0, this, qr.h, 320L, false);
        this.a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        xh.e1 e1Var = new xh.e1(frameLayout, f6Var, true);
        this.c = e1Var;
        frameLayout.setBackground(e1Var);
        e1Var.v = 1;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        u9 u9Var = new u9(context);
        this.d = u9Var;
        u9Var.getImageReceiver().setAutoRepeat(0);
        addView(u9Var, w7.x5.d(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        addView(textView, w7.x5.d(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setClickable(false);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 11.0f);
        textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
        textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(10.0f), 285212671));
        addView(textView2, w7.x5.d(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
    }

    public static void a(q0 q0Var, TLRPC.Document document, int i10, Object obj, boolean z10) {
        u9 u9Var = q0Var.d;
        if (document == null) {
            u9Var.b();
            q0Var.n = null;
            return;
        }
        if (q0Var.n == document) {
            return;
        }
        q0Var.n = document;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i10);
        sb2.append(z10 ? "_nolimit_pcache" : "");
        String sb3 = sb2.toString();
        u9Var.setLayoutParams(w7.x5.d(i10, i10, 49, 0.0f, r3 + 17, 0.0f, (80 - i10) / 2));
        u9Var.l(ImageLocation.getForDocument(document), sb3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), sb3, svgThumb, obj);
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
        b();
    }

    public final void b() {
        int d;
        xh.e1 e1Var = this.c;
        e1Var.x = null;
        Integer num = this.h;
        le.b bVar = this.r;
        TextView textView = this.f;
        if (num != null) {
            d = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(0.15f, 1.0f, bVar.e), this.h.intValue()));
            e1Var.x = this.h;
            this.b.invalidate();
            textView.setTextColor(i0.a.d(bVar.e, this.h.intValue(), -1));
        } else if (this.s) {
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            int d10 = i0.a.d(bVar.e, i0.a.d(0.05f, w02, org.telegram.ui.ActionBar.j6.w0(null, i11, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
            textView.setTextColor(i0.a.d(bVar.e, i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false)), -1));
            d = d10;
        } else {
            d = i0.a.d(0.5f, i0.a.k(this.v.a.center_color, 255), i0.a.k(this.v.a.pattern_color, 255));
            textView.setTextColor(-1);
        }
        if (textView.getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) textView.getBackground()).getPaint().setColor(d);
            textView.invalidate();
        } else if (org.telegram.ui.ActionBar.j6.B1(textView.getBackground(), d, false)) {
            textView.invalidate();
        }
    }

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
