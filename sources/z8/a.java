package z8;

import android.os.Parcel;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Float f7, float f10) {
        return AndroidUtilities.dp(f7.floatValue() * f10);
    }

    public static UnsupportedOperationException b(Parcel parcel) {
        g8.a.b(parcel);
        return new UnsupportedOperationException();
    }
}
