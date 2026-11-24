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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class spa extends FrameLayout {
    public final kv4 a;
    public final FrameLayout b;
    public final be0 c;
    public final TextView d;
    public final FrameLayout e;
    public final ImageView f;
    public TL_stars.StarGift h;
    public boolean n;

    public spa(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.d(-1, -1.0f, kk7.D1, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(bkb.b0(gl.L(18.0f), bkb.p1(0.12f, -4530177)));
        frameLayout.setForeground(new iqa(gl.L(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, nme.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b = frameLayout2;
        kv4 kv4Var = new kv4(frameLayout2, null, false);
        this.a = kv4Var;
        frameLayout2.setBackground(kv4Var);
        kv4Var.s = gl.L(18.0f);
        kv4Var.v = false;
        frameLayout.addView(frameLayout2, nme.e(-1, -1, kk7.D1));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        frameLayout2.addView(be0Var, nme.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, nme.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, nme.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, nme.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z) {
        boolean z2;
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) gta.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) gta.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) gta.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            kv4 kv4Var = this.a;
            kv4Var.d(stargiftattributebackdrop);
            kv4Var.e(stargiftattributepattern);
            jva.d1(this.c.getImageReceiver(), stargiftattributemodel.document, 52);
            int a = bkb.a(-0.05f, -0.15f, bkb.p1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String I0 = bc.I0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(I0);
            textView.setBackground(new iqa(gl.L(10.0f), a));
            this.e.setBackground(new iqa(gl.L(10.0f), a));
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
        s33 s33Var = s33.h;
        alpha.setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rpa
            public final /* synthetic */ spa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b = r3;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        textView.setVisibility(0);
        final byte b = 1;
        textView.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rpa
            public final /* synthetic */ spa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b2) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final byte b2 = 2;
        frameLayout2.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(s33Var).setDuration(420L).withEndAction(new Runnable(this) { // from class: rpa
            public final /* synthetic */ spa b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                boolean z3 = z;
                spa spaVar = this.b;
                switch (b22) {
                    case 0:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    case 1:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                    default:
                        if (!z3) {
                            spaVar.e.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        }).start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), TLObject.FLAG_30));
    }
}
