package u3;

import d5.z;
import java.nio.ByteBuffer;
import java.util.UUID;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class j {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static e4.e b(int i10, z zVar) {
        int e9 = zVar.e();
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            String n10 = zVar.n(e9 - 16);
            return new e4.e(TranslateController.UNKNOWN_LANGUAGE, n10, n10);
        }
        d5.a.K("MetadataUtil", "Failed to parse comment attribute: " + mc.k.a(i10));
        return null;
    }

    public static e4.a c(z zVar) {
        int e9 = zVar.e();
        if (zVar.e() != 1684108385) {
            d5.a.K("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int e10 = zVar.e() & 16777215;
        String str = e10 == 13 ? "image/jpeg" : e10 == 14 ? "image/png" : null;
        if (str == null) {
            com.google.android.recaptcha.internal.a.s(e10, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        zVar.D(4);
        int i10 = e9 - 16;
        byte[] bArr = new byte[i10];
        zVar.c(0, i10, bArr);
        return new e4.a(3, str, null, bArr);
    }

    public static e4.n d(int i10, String str, z zVar) {
        int e9 = zVar.e();
        if (zVar.e() == 1684108385 && e9 >= 22) {
            zVar.D(10);
            int w10 = zVar.w();
            if (w10 > 0) {
                String k10 = i0.a.k(w10, "");
                int w11 = zVar.w();
                if (w11 > 0) {
                    k10 = k10 + "/" + w11;
                }
                return new e4.n(str, null, p8.z.y(k10));
            }
        }
        d5.a.K("MetadataUtil", "Failed to parse index/count attribute: " + mc.k.a(i10));
        return null;
    }

    public static n1.d e(byte[] bArr) {
        z zVar = new z(bArr);
        if (zVar.c >= 32) {
            zVar.C(0);
            if (zVar.e() == zVar.a() + 4 && zVar.e() == 1886614376) {
                int b10 = mc.k.b(zVar.e());
                if (b10 > 1) {
                    com.google.android.recaptcha.internal.a.s(b10, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(zVar.l(), zVar.l());
                if (b10 == 1) {
                    zVar.D(zVar.u() * 16);
                }
                int u10 = zVar.u();
                if (u10 == zVar.a()) {
                    byte[] bArr2 = new byte[u10];
                    zVar.c(0, u10, bArr2);
                    return new n1.d(uuid, b10, bArr2);
                }
            }
        }
        return null;
    }

    public static e4.n f(int i10, String str, z zVar) {
        int e9 = zVar.e();
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            return new e4.n(str, null, p8.z.y(zVar.n(e9 - 16)));
        }
        d5.a.K("MetadataUtil", "Failed to parse text attribute: " + mc.k.a(i10));
        return null;
    }

    public static e4.j g(int i10, String str, z zVar, boolean z10, boolean z11) {
        int h = h(zVar);
        if (z11) {
            h = Math.min(1, h);
        }
        if (h >= 0) {
            return z10 ? new e4.n(str, null, p8.z.y(Integer.toString(h))) : new e4.e(TranslateController.UNKNOWN_LANGUAGE, str, Integer.toString(h));
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute: " + mc.k.a(i10));
        return null;
    }

    public static int h(z zVar) {
        zVar.D(4);
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            return zVar.r();
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean i(m3.l lVar, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        long length = lVar.getLength();
        long j10 = 4096;
        long j11 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i12 != 0 && length <= 4096) {
            j10 = length;
        }
        int i13 = (int) j10;
        z zVar = new z(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (i15 < i13) {
            zVar.z(8);
            if (!lVar.g(zVar.a, i14, 8, true)) {
                break;
            }
            long s10 = zVar.s();
            int e9 = zVar.e();
            if (s10 == 1) {
                lVar.b(8, 8, zVar.a);
                zVar.B(16);
                i10 = i15;
                s10 = zVar.l();
                i11 = 16;
            } else {
                if (s10 == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j11) {
                        s10 = (length2 - lVar.i()) + 8;
                    }
                }
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (s10 < j12) {
                return false;
            }
            int i16 = i10 + i11;
            if (e9 == 1836019574) {
                i13 += (int) s10;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i16;
            } else {
                if (e9 == 1836019558 || e9 == 1836475768) {
                    z12 = true;
                    break;
                }
                int i17 = i12;
                if ((i16 + s10) - j12 >= i13) {
                    break;
                }
                int i18 = (int) (s10 - j12);
                i15 = i16 + i18;
                if (e9 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    zVar.z(i18);
                    lVar.b(0, i18, zVar.a);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 != 1) {
                            int e10 = zVar.e();
                            if ((e10 >>> 8) != 3368816 && (e10 != 1751476579 || !z11)) {
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (b[i21] != e10) {
                                    }
                                }
                            }
                            z13 = true;
                            break;
                        }
                        zVar.D(4);
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i18 != 0) {
                    lVar.j(i18);
                }
                i12 = i17;
            }
            j11 = -1;
            i14 = 0;
        }
        z12 = false;
        return z13 && z10 == z12;
    }
}
