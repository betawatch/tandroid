// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wy8 extends j79 {
    public final /* synthetic */ pz8 c;

    public wy8(pz8 pz8Var) {
        this.c = pz8Var;
    }

    @Override // j79
    public final int b() {
        return this.c.s;
    }

    @Override // j79
    public final int d(int i) {
        pz8 pz8Var = this.c;
        az8 az8Var = (az8) pz8Var.n.get(pz8Var.f(i));
        return (az8Var.b == null || i != az8Var.d) ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        pz8 pz8Var = this.c;
        az8 az8Var = (az8) pz8Var.n.get(pz8Var.f(i));
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            ((xy8) view).set((TLRPC.Document) az8Var.c.get((i - az8Var.d) - (az8Var.b == null ? 0 : 1)));
            return;
        }
        zy8 zy8Var = (zy8) view;
        String str = az8Var.b;
        int i3 = (pz8Var.x || az8Var.a != 2) ? 0 : 1;
        TextView textView = zy8Var.b;
        TextView textView2 = zy8Var.a;
        textView2.setText(str != null ? str.replace('\n', ' ') : null);
        textView2.setTextColor(zy8Var.c.y);
        textView.setVisibility(i3 != 0 ? 0 : 8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L = hl.L(15.0f) + (i3 != 0 ? hl.L(6.0f) + hl.L(20.0f) + hl.L(12.0f) + ((int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()))) : 0);
        if (layoutParams.rightMargin != L) {
            layoutParams.rightMargin = L;
            textView2.setLayoutParams(layoutParams);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View xy8Var;
        pz8 pz8Var = this.c;
        if (i == 0) {
            xy8Var = new zy8(pz8Var, viewGroup.getContext());
            xy8Var.setLayoutParams(new r79(-1, hl.L(44.0f)));
        } else {
            xy8Var = new xy8(viewGroup.getContext(), pz8Var.a);
            xy8Var.setLayoutParams(new r79(-1, -2));
        }
        return new vy8(xy8Var);
    }
}
