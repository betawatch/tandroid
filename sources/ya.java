// default package

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ya extends jh2 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(pt4 pt4Var, Context context, r63 r63Var) {
        super(24, r63Var, context);
        this.d = (byte) 2;
        this.e = pt4Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.d;
        ViewGroup viewGroup = this.e;
        switch (b) {
            case 0:
                super.invalidate();
                ((bb) viewGroup).invalidate();
                break;
            case 1:
                super.invalidate();
                ((hg3) viewGroup).invalidate();
                break;
            default:
                super.invalidate();
                ((pt4) viewGroup).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(ViewGroup viewGroup, Context context, ylb ylbVar, byte b) {
        super(21, ylbVar, context);
        this.d = b;
        this.e = viewGroup;
    }
}
