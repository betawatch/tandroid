// default package

import java.io.File;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r60 extends n51 {
    public final long e;

    public r60(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
