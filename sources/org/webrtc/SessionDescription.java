package org.webrtc;

import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class SessionDescription {
    public final String description;
    public final Type type;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }
    }

    public SessionDescription(Type type, String str) {
        this.type = type;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
