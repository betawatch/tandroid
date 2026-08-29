package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new e());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        f fVar = (f) view;
        if (w41Var.G == null) {
            fVar.setAsShowMore((l) w41Var.H);
            return;
        }
        int i10 = w41Var.z;
        String charSequence = w41Var.l.toString();
        View.OnClickListener onClickListener = w41Var.D;
        l lVar = (l) w41Var.H;
        ImageView imageView = fVar.a;
        imageView.setVisibility(0);
        int i11 = lVar.B;
        int i12 = lVar.D;
        TextView textView = fVar.b;
        textView.setTextColor(i12);
        int l1 = g6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = fVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, i12), mode));
        imageView2.setBackground(g6.Z(0, g6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(g6.l1(0.1f, lVar.D));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new f(context);
    }
}
