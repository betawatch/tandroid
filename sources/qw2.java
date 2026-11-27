// default package

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qw2 extends LinearLayout {
    public final de0 a;
    public final ema b;
    public final vnb c;
    public TLRPC.StickerSetCovered d;

    public qw2(Context context, vnb vnbVar) {
        super(context);
        this.c = vnbVar;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        ema emaVar = new ema(context);
        this.b = emaVar;
        emaVar.setTextSize(16);
        emaVar.setTextColor(-1);
        setOrientation(0);
        addView(de0Var, tre.t(24, 24, 17, 17, 0, 17, 0));
        addView(emaVar, tre.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
