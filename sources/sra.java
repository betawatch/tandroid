// default package

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sra extends FrameLayout {
    public final lx4 a;
    public final FrameLayout b;
    public final bf0 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public sra(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, qoe.d(-1, -1.0f, nm7.D1, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(cmb.b0(gm.L(18.0f), cmb.p1(0.12f, -4530177)));
        frameLayout.setForeground(new isa(gm.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, qoe.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        lx4 lx4Var = new lx4(frameLayout2, null, false);
        this.a = lx4Var;
        frameLayout2.setBackground(lx4Var);
        lx4Var.s = gm.L(18.0f);
        lx4Var.v = false;
        frameLayout.addView(frameLayout2, qoe.e(-1, -1, nm7.D1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        frameLayout2.addView(bf0Var, qoe.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, qoe.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, qoe.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, qoe.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z) {
        boolean z2;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            lx4 lx4Var = this.a;
            lx4Var.d(stargiftattributebackdrop);
            lx4Var.e(stargiftattributepattern);
            nxa.e1(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int a = cmb.a(-0.05f, -0.15f, cmb.p1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String J0 = bc.J0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(J0);
            textView.setBackground(new isa(gm.L(10.0f), a));
            this.e.setBackground(new isa(gm.L(10.0f), a));
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2, z);
    }

    public final void b(final boolean z, boolean z2) {
        FrameLayout frameLayout = this.b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.e;
        frameLayout2.animate().cancel();
        if (!z2) {
            frameLayout.setVisibility(z ? 0 : 8);
            frameLayout.setScaleX(z ? 1.0f : 0.6f);
            frameLayout.setScaleY(z ? 1.0f : 0.6f);
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            textView.setVisibility(z ? 0 : 8);
            textView.setAlpha(z ? 1.0f : 0.0f);
            frameLayout2.setVisibility(z ? (byte) 0 : (byte) 8);
            frameLayout2.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator alpha = frameLayout.animate().scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).alpha(z ? 1.0f : 0.0f);
        d53 d53Var = d53.h;
        alpha.setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rra
            public final /* synthetic */ sra b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        textView.setVisibility(0);
        final byte b = 1;
        textView.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rra
            public final /* synthetic */ sra b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b2) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final byte b2 = 2;
        frameLayout2.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(d53Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rra
            public final /* synthetic */ sra b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                boolean z3 = z;
                sra sraVar = this.b;
                switch (b22) {
                    case 0:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            sraVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), TLObject.FLAG_30));
    }
}
