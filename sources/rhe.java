// default package

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class rhe {
    public static KeyEvent a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("android.intent.extra.KEY_EVENT")) {
                    return (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
                }
            } catch (RuntimeException e) {
                efd.g("DefaultActionFactory", "Failed to get parcelable key event", e);
            }
        }
        return null;
    }
}
