package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new e());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        f fVar = (f) view;
        if (u61Var.G == null) {
            fVar.setAsShowMore((l) u61Var.H);
            return;
        }
        int i10 = u61Var.z;
        String charSequence = u61Var.l.toString();
        View.OnClickListener onClickListener = u61Var.D;
        l lVar = (l) u61Var.H;
        ImageView imageView = fVar.a;
        imageView.setVisibility(0);
        int i11 = lVar.F;
        int i12 = lVar.H;
        TextView textView = fVar.b;
        textView.setTextColor(i12);
        int o12 = y6.o1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(o12, mode));
        ImageView imageView2 = fVar.c;
        imageView2.setColorFilter(new PorterDuffColorFilter(y6.o1(0.6f, i12), mode));
        imageView2.setBackground(y6.a0(0, y6.o1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(y6.o1(0.1f, lVar.H));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new f(context);
    }
}
