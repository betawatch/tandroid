package org.webrtc;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class Environment implements AutoCloseable {
    private final long webrtcEnv;

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
