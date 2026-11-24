// default package

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class tka {
    public static final w59 a = mm5.u(12);

    public static mm5 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new xz((byte) 0))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && g8c.N(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return mm5.q(treeSet);
    }

    public static mm5 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        mm5 mm5Var;
        int speakerLayoutChannelMask;
        boolean a2 = nde.a(audioDeviceInfo.getType());
        w59 w59Var = a;
        if (!a2) {
            if (audioDeviceInfo.getType() == 1) {
                return mm5.u(4);
            }
            int type2 = audioDeviceInfo.getType();
            int i = Build.VERSION.SDK_INT;
            if (type2 == 2) {
                if (i >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return mm5.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                lad.f("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return w59Var;
            }
            if (i >= 31) {
                if (audioDeviceInfo.getType() == 10) {
                    mm5 a3 = a(audioDeviceInfo);
                    if (!a3.isEmpty()) {
                        return a3;
                    }
                    mm5 l = yz.l(audioDeviceInfo.getAudioDescriptors());
                    if (!l.isEmpty()) {
                        return l;
                    }
                } else {
                    int type3 = audioDeviceInfo.getType();
                    if (i >= 31 && type3 == 29) {
                        mm5 a4 = a(audioDeviceInfo);
                        if (!a4.isEmpty()) {
                            return a4;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                km5 km5Var = mm5.b;
                                mm5Var = w59.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor a5 = wz.a(it.next());
                                    if (a5.getStandard() == 2) {
                                        byte[] descriptor = a5.getDescriptor();
                                        if (descriptor.length != 3) {
                                            lad.f("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                r10 = (b & 1) != 0 ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r10 |= kk7.V2;
                                                }
                                                if ((b & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r10 |= TLObject.FLAG_13;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r10 |= TLObject.FLAG_23;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.-EL.sort(arrayList, new sa((byte) 3));
                                mm5Var = mm5.q(arrayList);
                            }
                            if (!mm5Var.isEmpty()) {
                                return mm5Var;
                            }
                        }
                        mm5 l2 = yz.l(audioDescriptors);
                        if (!l2.isEmpty()) {
                            return l2;
                        }
                    }
                }
            }
            if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                mm5 a6 = a(audioDeviceInfo);
                if (!a6.isEmpty()) {
                    return a6;
                }
            }
        }
        return w59Var;
    }
}
