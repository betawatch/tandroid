package yh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class w2 extends FrameLayout {
    public final xh.e1 a;
    public final FrameLayout b;
    public final u9 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public w2(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new m3(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, w7.x5.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        xh.e1 e1Var = new xh.e1(frameLayout2, null, false);
        this.a = e1Var;
        frameLayout2.setBackground(e1Var);
        e1Var.s = AndroidUtilities.dp(18.0f);
        e1Var.u = false;
        frameLayout.addView(frameLayout2, w7.x5.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        u9 u9Var = new u9(context);
        this.c = u9Var;
        frameLayout2.addView(u9Var, w7.x5.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, w7.x5.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, w7.x5.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, w7.x5.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            xh.e1 e1Var = this.a;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e(stargiftattributepattern);
            x7.Z0(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int b10 = org.telegram.ui.ActionBar.i6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.i6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String G0 = ei.l.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(G0);
            textView.setBackground(new m3(AndroidUtilities.dp(10.0f), b10));
            this.e.setBackground(new m3(AndroidUtilities.dp(10.0f), b10));
        }
        b(starGift != null, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        FrameLayout frameLayout = this.b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        if (!z11) {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setScaleX(z10 ? 1.0f : 0.6f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.6f);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setVisibility(z10 ? 0 : 8);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout2.setVisibility(z10 ? 0 : 8);
            frameLayout2.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator alpha = frameLayout.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f);
        qr qrVar = qr.h;
        final int i10 = 0;
        alpha.setInterpolator(qrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: yh.v2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z10;
                        w2 w2Var = this.b;
                        if (!z12) {
                            w2Var.e.setVisibility(8);
                            break;
                        } else {
                            w2Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        w2 w2Var2 = this.b;
                        if (!z13) {
                            w2Var2.e.setVisibility(8);
                            break;
                        } else {
                            w2Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        w2 w2Var3 = this.b;
                        if (!z14) {
                            w2Var3.e.setVisibility(8);
                            break;
                        } else {
                            w2Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        textView.setVisibility(0);
        final int i11 = 1;
        textView.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(qrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: yh.v2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z10;
                        w2 w2Var = this.b;
                        if (!z12) {
                            w2Var.e.setVisibility(8);
                            break;
                        } else {
                            w2Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        w2 w2Var2 = this.b;
                        if (!z13) {
                            w2Var2.e.setVisibility(8);
                            break;
                        } else {
                            w2Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        w2 w2Var3 = this.b;
                        if (!z14) {
                            w2Var3.e.setVisibility(8);
                            break;
                        } else {
                            w2Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final int i12 = 2;
        frameLayout2.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(qrVar).setDuration(420L).withEndAction(new Runnable(this) { // from class: yh.v2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z12 = z10;
                        w2 w2Var = this.b;
                        if (!z12) {
                            w2Var.e.setVisibility(8);
                            break;
                        } else {
                            w2Var.getClass();
                            break;
                        }
                    case 1:
                        boolean z13 = z10;
                        w2 w2Var2 = this.b;
                        if (!z13) {
                            w2Var2.e.setVisibility(8);
                            break;
                        } else {
                            w2Var2.getClass();
                            break;
                        }
                    default:
                        boolean z14 = z10;
                        w2 w2Var3 = this.b;
                        if (!z14) {
                            w2Var3.e.setVisibility(8);
                            break;
                        } else {
                            w2Var3.getClass();
                            break;
                        }
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
    }
}
