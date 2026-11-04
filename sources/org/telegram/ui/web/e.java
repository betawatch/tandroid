package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class e extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new e());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        f fVar = (f) view;
        if (r31Var.G == null) {
            fVar.setAsShowMore((l) r31Var.H);
            return;
        }
        int i3 = r31Var.z;
        String charSequence = r31Var.l.toString();
        View.OnClickListener onClickListener = r31Var.D;
        l lVar = (l) r31Var.H;
        ImageView imageView = fVar.a;
        imageView.setVisibility(0);
        int i10 = lVar.G;
        int i11 = lVar.I;
        TextView textView = fVar.b;
        textView.setTextColor(i11);
        int r12 = k6.r1(0.6f, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = fVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, i11), mode));
        imageView2.setBackground(k6.b0(0, k6.r1(0.15f, i11), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        imageView.setImageResource(i3 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(k6.r1(0.1f, lVar.I));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new f(context);
    }
}
