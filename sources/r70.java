// default package

import java.io.File;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r70 extends u61 {
    public final long e;

    public r70(File file) {
        super(file);
        this.e = Utilities.getLastUsageFileTime(file.getAbsolutePath());
    }
}
