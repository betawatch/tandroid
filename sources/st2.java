// default package

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class st2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ st2(na7 na7Var, int i, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x011b, code lost:
    
        if (r5 <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r5 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
    
        if (r5 <= 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b A[ADDED_TO_REGION] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.a;
        int i7 = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.User V1 = na7Var.V1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                TLRPC.User V12 = na7Var.V1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                if (V1 != null) {
                    if (V1.self) {
                        i = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = V1.status;
                        if (userStatus != null) {
                            i = userStatus.expires;
                        }
                    }
                    if (V12 != null) {
                        if (V12.self) {
                            i2 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = V12.status;
                            if (userStatus2 != null) {
                                i2 = userStatus2.expires;
                            }
                        }
                        if (i > 0 || i2 <= 0) {
                            if (i < 0) {
                                if (i2 < 0) {
                                    if (i <= i2) {
                                        if (i >= i2) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i == 0 || i2 == 0) {
                                if ((i2 < 0 || i <= 0) && (i2 != 0 || i == 0)) {
                                }
                            }
                        } else if (i <= i2) {
                            if (i >= i2) {
                            }
                        }
                    }
                    i2 = 0;
                    if (i > 0) {
                    }
                    if (i < 0) {
                    }
                    if (i == 0) {
                    }
                    if (i2 < 0) {
                    }
                }
                i = 0;
                if (V12 != null) {
                }
                i2 = 0;
                if (i > 0) {
                }
                if (i < 0) {
                }
                if (i == 0) {
                }
                if (i2 < 0) {
                }
                break;
            case 1:
                TLRPC.User V13 = na7Var.V1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id));
                TLRPC.User V14 = na7Var.V1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                if (V13 != null) {
                    if (V13.self) {
                        i3 = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = V13.status;
                        if (userStatus3 != null) {
                            i3 = userStatus3.expires;
                        }
                    }
                    if (V14 != null) {
                        if (V14.self) {
                            i4 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = V14.status;
                            if (userStatus4 != null) {
                                i4 = userStatus4.expires;
                            }
                        }
                        if (i3 > 0 || i4 <= 0) {
                            if (i3 < 0) {
                                if (i4 < 0) {
                                    if (i3 <= i4) {
                                        if (i3 >= i4) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i3 == 0 || i4 == 0) {
                                if (i4 >= 0 && i3 == 0) {
                                }
                            }
                        } else if (i3 <= i4) {
                            if (i3 >= i4) {
                            }
                        }
                    }
                    i4 = 0;
                    if (i3 > 0) {
                    }
                    if (i3 < 0) {
                    }
                    if (i3 == 0) {
                    }
                    if (i4 >= 0) {
                    }
                }
                i3 = 0;
                if (V14 != null) {
                }
                i4 = 0;
                if (i3 > 0) {
                }
                if (i3 < 0) {
                }
                if (i3 == 0) {
                }
                if (i4 >= 0) {
                }
                break;
            default:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User V15 = tLObject2 instanceof TLRPC.TL_contact ? na7Var.V1(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User V16 = tLObject instanceof TLRPC.TL_contact ? na7Var.V1(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                if (V15 != null) {
                    if (V15.self) {
                        i5 = i7 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = V15.status;
                        if (userStatus5 != null) {
                            i5 = userStatus5.expires;
                        }
                    }
                    if (V16 != null) {
                        if (V16.self) {
                            i6 = i7 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = V16.status;
                            if (userStatus6 != null) {
                                i6 = userStatus6.expires;
                            }
                        }
                        if (i5 > 0 || i6 <= 0) {
                            if (i5 < 0) {
                                if (i6 < 0) {
                                    if (i5 <= i6) {
                                        if (i5 >= i6) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (i5 == 0 || i6 == 0) {
                                if (i6 >= 0 && i5 == 0) {
                                }
                            }
                        } else if (i5 <= i6) {
                            if (i5 >= i6) {
                            }
                        }
                    }
                    i6 = 0;
                    if (i5 > 0) {
                    }
                    if (i5 < 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 >= 0) {
                    }
                }
                i5 = 0;
                if (V16 != null) {
                }
                i6 = 0;
                if (i5 > 0) {
                }
                if (i5 < 0) {
                }
                if (i5 == 0) {
                }
                if (i6 >= 0) {
                }
                break;
        }
        return 1;
    }
}
