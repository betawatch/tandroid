// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class yx1 extends q67 {
    public final /* synthetic */ knc E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar, knc kncVar) {
        super(context, vnbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = kncVar;
    }

    @Override // q67
    public final void m(long j) {
        this.F0.setEffectId(j);
        knc kncVar = this.E0;
        if (kncVar != null) {
            kncVar.invalidate();
        }
    }
}
