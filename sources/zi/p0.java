package zi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class p0 {
    public static /* synthetic */ String a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "ERROR" : "CANCELLED" : "AUDIO_REMOVED" : "TRIMMED";
    }

    public static /* synthetic */ String b(int i7) {
        switch (i7) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
