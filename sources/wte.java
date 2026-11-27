// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class wte extends IOException {
    public static wte a() {
        return new wte("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static wte b() {
        return new wte("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static wte c() {
        return new wte("Protocol message had invalid UTF-8.");
    }
}
