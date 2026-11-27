// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class rca extends View {
    public int a;
    public final int b;
    public boolean c;
    public boolean d;

    public rca(Context context, uh9 uh9Var) {
        super(context);
        this.c = true;
        this.d = true;
        this.a = 12;
        int i = this.b;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }

    private int getBackgroundResId() {
        boolean z = this.c;
        boolean z2 = this.d;
        return z ? z2 ? R.drawable.greydivider : R.drawable.greydivider_bottom : z2 ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.a), TLObject.FLAG_30));
    }

    public void setSize(int i) {
        this.a = i;
    }

    public rca(Context context, Object obj) {
        this(context, (uh9) null);
    }

    public rca(Context context) {
        this(context, (uh9) null);
    }

    public rca(Context context, int i, int i2) {
        super(context);
        this.c = true;
        this.d = true;
        this.b = i;
        this.a = 12;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }
}
