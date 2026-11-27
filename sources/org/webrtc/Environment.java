package org.webrtc;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public static class Builder {
        private String fieldTrials;

        public Environment build() {
            return new Environment(this.fieldTrials, 0);
        }

        public Builder setFieldTrials(String str) {
            this.fieldTrials = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    interface Natives {
        long create(String str);

        long currentTimeNanos(long j);

        void free(long j);
    }

    private Environment(String str) {
        this.webrtcEnv = EnvironmentJni.get().create(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        EnvironmentJni.get().free(this.webrtcEnv);
    }

    public long getCurrentTimeNanos() {
        return EnvironmentJni.get().currentTimeNanos(this.webrtcEnv);
    }

    public long ref() {
        return this.webrtcEnv;
    }

    public /* synthetic */ Environment(String str, int i) {
        this(str);
    }
}
