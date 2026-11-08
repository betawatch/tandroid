package q6;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t implements DialogInterface.OnClickListener {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ GoogleApiActivity b;

    public t(Intent intent, GoogleApiActivity googleApiActivity) {
        this.a = intent;
        this.b = googleApiActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                Intent intent = this.a;
                if (intent != null) {
                    this.b.startActivityForResult(intent, 2);
                }
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
