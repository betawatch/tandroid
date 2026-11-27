// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vjc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mkc b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ vjc(mkc mkcVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = mkcVar;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        mkc mkcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new xjc(mkcVar, (byte) 8));
                int i = mkcVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    break;
                }
                break;
            default:
                hl.c3(new xjc(mkcVar, (byte) 10));
                int i2 = mkcVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    break;
                }
                break;
        }
    }
}
