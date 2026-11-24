// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class uk2 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new uk2());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        vk2 vk2Var = (vk2) view;
        boolean z2 = false;
        vk2Var.setGrid(c4cVar.v == 1);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
        TextView textView = vk2Var.d;
        TextView textView2 = vk2Var.c;
        be0 be0Var = vk2Var.b;
        gl5 gl5Var = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(k96.M0(2131742933, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new tk2(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b2 = vk2.b(nftitem, "Model");
        String b3 = vk2.b(nftitem, "Backdrop");
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            textView.setText(nftitem.description);
        } else {
            textView.setText(k96.V(null, null, 2131742931, b2, b3));
        }
        gl5 c = vk2.c(nftitem, !vk2Var.f);
        int v0 = bkb.v0(bkb.x6, vk2Var.a);
        Drawable mutate = vk2Var.getContext().getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        ShapeDrawable b0 = bkb.b0(gl.L(vk2Var.f ? 11.0f : 8.0f), bkb.p1(0.1f, v0));
        fm2 fm2Var = new fm2(b0, mutate);
        vk2Var.h = mutate;
        vk2Var.n = b0;
        vk2Var.r = v0;
        if (c == null) {
            be0Var.setImageDrawable(fm2Var);
        } else if (vk2Var.f) {
            if (nftitem.image_small != null && nftitem.image != null) {
                gl5Var = vk2.c(nftitem, true);
            }
            be0Var.a.Z(c, "160_160", gl5Var, "100_100", fm2Var, 0L, null, nftitem, 0);
            be0Var.e();
        } else {
            be0Var.m(c, "46_46", fm2Var, nftitem);
        }
        if (z && !vk2Var.f) {
            z2 = true;
        }
        vk2Var.e = z2;
        vk2Var.updateColors();
        vk2Var.invalidate();
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (!e(c4cVar, c4cVar2)) {
            return false;
        }
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c4cVar2.H;
        if (nftitem != nftitem2) {
            return nftitem != null && nftitem2 != null && Objects.equals(nftitem.name, nftitem2.name) && Objects.equals(nftitem.image, nftitem2.image) && Objects.equals(nftitem.image_small, nftitem2.image_small) && Objects.equals(nftitem.description, nftitem2.description) && Objects.equals(nftitem.attributes, nftitem2.attributes) && Objects.equals(nftitem.extra, nftitem2.extra);
        }
        return true;
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new vk2(context, wjbVar);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c4cVar2.H;
        return (nftitem == null || nftitem2 == null) ? nftitem == nftitem2 : TextUtils.equals(nftitem.address, nftitem2.address);
    }

    @Override // b4c
    public final boolean f() {
        return true;
    }
}
