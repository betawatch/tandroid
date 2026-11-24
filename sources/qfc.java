// default package

import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(new sfc(hgcVar, (byte) 8));
                int i = hgcVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    break;
                }
                break;
            default:
                gl.d3(new sfc(hgcVar, (byte) 10));
                int i2 = hgcVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    break;
                }
                break;
        }
    }
}
