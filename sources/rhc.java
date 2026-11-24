// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iic b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ rhc(iic iicVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = iicVar;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new thc(iicVar, (byte) 8));
                int i = iicVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    break;
                }
                break;
            default:
                gm.c3(new thc(iicVar, (byte) 10));
                int i2 = iicVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    break;
                }
                break;
        }
    }
}
