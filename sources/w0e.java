// default package

/* loaded from: classes.dex */
public final class w0e {
    public final /* synthetic */ byte a;

    public static int a(long j, byte[] bArr, int i, int i2) {
        int i3;
        if (i2 == 0) {
            w0e w0eVar = l0e.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            byte a = uzd.a(j, bArr);
            w0e w0eVar2 = l0e.a;
            if (i > -12 || a > -65) {
                return -1;
            }
            i3 = a << 8;
        } else {
            if (i2 != 2) {
                wn4.f();
                return 0;
            }
            byte a2 = uzd.a(j, bArr);
            byte a3 = uzd.a(j + 1, bArr);
            w0e w0eVar3 = l0e.a;
            if (i > -12 || a2 > -65 || a3 > -65) {
                return -1;
            }
            i ^= a2 << 8;
            i3 = a3 << 16;
        }
        return i ^ i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        r8 = a(r1, r22, r11, r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        byte b;
        int i3;
        int i4 = i;
        byte b2 = -96;
        switch (this.a) {
            case 0:
                z = true;
                z2 = false;
                while (true) {
                    if (i4 < i2) {
                        if (bArr[i4] >= 0) {
                            i4++;
                        } else {
                            while (i4 < i2) {
                                int i5 = i4 + 1;
                                byte b3 = bArr[i4];
                                if (b3 >= 0) {
                                    i4 = i5;
                                } else if (b3 >= -32) {
                                    if (b3 >= -16) {
                                        if (i5 < i2 - 2) {
                                            int i6 = i4 + 2;
                                            byte b4 = bArr[i5];
                                            if (b4 <= -65 && (((b4 + 112) + (b3 << 28)) >> 30) == 0) {
                                                int i7 = i4 + 3;
                                                if (bArr[i6] > -65) {
                                                    break;
                                                } else {
                                                    i4 += 4;
                                                    if (bArr[i7] > -65) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            b = l0e.a(i5, i2, bArr);
                                        }
                                    } else if (i5 < i2 - 1) {
                                        int i8 = i4 + 2;
                                        byte b5 = bArr[i5];
                                        if (b5 <= -65 && ((b3 != -32 || b5 >= -96) && (b3 != -19 || b5 < -96))) {
                                            i4 += 3;
                                            if (bArr[i8] > -65) {
                                                break;
                                            }
                                        }
                                    } else {
                                        b = l0e.a(i5, i2, bArr);
                                    }
                                } else if (i5 < i2) {
                                    if (b3 < -62) {
                                        break;
                                    } else {
                                        i4 += 2;
                                        if (bArr[i5] > -65) {
                                            break;
                                        }
                                    }
                                } else {
                                    b = b3;
                                }
                            }
                        }
                    }
                }
                b = z2;
                return b != 0 ? z : z2;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j = i4;
                z = true;
                z2 = false;
                int i9 = (int) (i2 - j);
                if (i9 < 16) {
                    i3 = 0;
                } else {
                    long j2 = j;
                    i3 = 0;
                    while (true) {
                        if (i3 < i9) {
                            long j3 = j2 + 1;
                            if (uzd.a(j2, bArr) >= 0) {
                                i3++;
                                j2 = j3;
                            }
                        } else {
                            i3 = i9;
                        }
                    }
                }
                int i10 = i9 - i3;
                long j4 = j + i3;
                while (true) {
                    byte b6 = 0;
                    while (true) {
                        if (i10 > 0) {
                            long j5 = j4 + 1;
                            b6 = uzd.a(j4, bArr);
                            if (b6 >= 0) {
                                i10--;
                                j4 = j5;
                            } else {
                                j4 = j5;
                            }
                        }
                    }
                    if (i10 == 0) {
                        break;
                    } else {
                        int i11 = i10 - 1;
                        if (b6 < -32) {
                            if (i11 == 0) {
                                b = b6;
                            } else {
                                i10 -= 2;
                                if (b6 >= -62) {
                                    long j6 = j4 + 1;
                                    if (uzd.a(j4, bArr) <= -65) {
                                        j4 = j6;
                                        b2 = -96;
                                    }
                                }
                            }
                        } else if (b6 < -16) {
                            if (i11 < 2) {
                                break;
                            } else {
                                i10 -= 3;
                                long j7 = j4 + 1;
                                byte a = uzd.a(j4, bArr);
                                if (a <= -65 && ((b6 != -32 || a >= b2) && (b6 != -19 || a < b2))) {
                                    j4 += 2;
                                    if (uzd.a(j7, bArr) > -65) {
                                    }
                                }
                            }
                        } else if (i11 < 3) {
                            break;
                        } else {
                            i10 -= 4;
                            long j8 = j4 + 1;
                            byte a2 = uzd.a(j4, bArr);
                            if (a2 <= -65 && (((a2 + 112) + (b6 << 28)) >> 30) == 0) {
                                long j9 = j4 + 2;
                                if (uzd.a(j8, bArr) <= -65) {
                                    j4 += 3;
                                    if (uzd.a(j9, bArr) > -65) {
                                    }
                                    b2 = -96;
                                }
                            }
                        }
                    }
                }
                b = -1;
                if (b != 0) {
                }
                break;
        }
    }
}
