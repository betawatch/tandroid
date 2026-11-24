// default package

import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u73 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ u73(DataSettingsActivity dataSettingsActivity, byte b) {
        this.a = b;
        this.b = dataSettingsActivity;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r9;
        byte b = this.a;
        DataSettingsActivity dataSettingsActivity = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                dataSettingsActivity.getMediaDataController().G(true);
                break;
            case 1:
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.a != null && (r9 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(r9 == true ? 1 : 0);
                    break;
                }
                break;
            default:
                y71.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                u73 u73Var = new u73(dataSettingsActivity2, b2);
                gm.d3(u73Var, 100L);
                y71.d0(new p2c((Object) dataSettingsActivity2, (Object) u73Var, System.currentTimeMillis(), (byte) 1));
                break;
        }
    }
}
