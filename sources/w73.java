// default package

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.DataSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class w73 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DataSettingsActivity a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ int c;

    public /* synthetic */ w73(DataSettingsActivity dataSettingsActivity, SharedPreferences sharedPreferences, int i) {
        this.a = dataSettingsActivity;
        this.b = sharedPreferences;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        DataSettingsActivity dataSettingsActivity = this.a;
        dataSettingsActivity.getClass();
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                i2 = i != 2 ? i != 3 ? -1 : 2 : 1;
            }
        } else {
            i2 = 0;
        }
        if (i2 != -1) {
            this.b.edit().putInt("VoipDataSaving", i2).commit();
            dataSettingsActivity.V = true;
        }
        s30 s30Var = dataSettingsActivity.a;
        if (s30Var != null) {
            s30Var.g(this.c);
        }
    }
}
