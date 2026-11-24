// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qfc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hgc b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ qfc(hgc hgcVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = hgcVar;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new sfc(hgcVar, (byte) 8));
                int i = hgcVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    break;
                }
                break;
            default:
                gl.c3(new sfc(hgcVar, (byte) 10));
                int i2 = hgcVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    break;
                }
                break;
        }
    }
}
