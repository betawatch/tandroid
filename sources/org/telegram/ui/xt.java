package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xt extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ DataAutoDownloadActivity d;

    public xt(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int b10 = q1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i9 = dataAutoDownloadActivity.photosRow;
        if (b10 == i9) {
            return true;
        }
        i10 = dataAutoDownloadActivity.videosRow;
        if (b10 == i10) {
            return true;
        }
        i11 = dataAutoDownloadActivity.filesRow;
        if (b10 == i11) {
            return true;
        }
        i12 = dataAutoDownloadActivity.storiesRow;
        return b10 == i12;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.x;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.autoDownloadRow;
        if (i9 == i10) {
            return 0;
        }
        if (i9 == dataAutoDownloadActivity.s) {
            return 1;
        }
        if (i9 == dataAutoDownloadActivity.r || i9 == dataAutoDownloadActivity.v) {
            return 2;
        }
        i11 = dataAutoDownloadActivity.usageProgressRow;
        if (i9 == i11) {
            return 3;
        }
        i12 = dataAutoDownloadActivity.photosRow;
        if (i9 == i12) {
            return 4;
        }
        i13 = dataAutoDownloadActivity.videosRow;
        if (i9 == i13) {
            return 4;
        }
        i14 = dataAutoDownloadActivity.filesRow;
        if (i9 == i14) {
            return 4;
        }
        i15 = dataAutoDownloadActivity.storiesRow;
        return i9 == i15 ? 4 : 5;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        String string;
        int i14;
        DownloadController.Preset currentRoamingPreset;
        int i15;
        int i16;
        int i17;
        StringBuilder sb2;
        StringBuilder sb3;
        int i18;
        int i19;
        int i20;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i21 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i22 = q1Var.f;
        View view = q1Var.a;
        int i23 = 0;
        if (i22 == 0) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i10 = dataAutoDownloadActivity.autoDownloadRow;
            if (i9 == i10) {
                t8Var.setDrawCheckRipple(true);
                t8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
                t8Var.setTag(Integer.valueOf(preset.enabled ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6));
                t8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, preset.enabled ? org.telegram.ui.ActionBar.f6.f6 : org.telegram.ui.ActionBar.f6.e6, false));
                return;
            }
            return;
        }
        if (i22 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == dataAutoDownloadActivity.r) {
                m4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else {
                if (i9 == dataAutoDownloadActivity.v) {
                    m4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                    return;
                }
                return;
            }
        }
        if (i22 == 3) {
            dataAutoDownloadActivity.l0((org.telegram.ui.Components.bv0) view);
            return;
        }
        int i24 = -1;
        if (i22 != 4) {
            if (i22 != 5) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == dataAutoDownloadActivity.w) {
                b9Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                b9Var.setFixedSize(0);
                b9Var.setImportantForAccessibility(1);
                return;
            } else {
                if (i9 == dataAutoDownloadActivity.n) {
                    if (dataAutoDownloadActivity.r != -1) {
                        b9Var.setText(null);
                        b9Var.setFixedSize(12);
                        b9Var.setImportantForAccessibility(4);
                        return;
                    }
                    if (i21 == 0) {
                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                    } else if (i21 == 1) {
                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                    } else if (i21 == 2) {
                        b9Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                    }
                    b9Var.setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
        j5Var.setDrawLine(true);
        i11 = dataAutoDownloadActivity.photosRow;
        if (i9 == i11) {
            string = LocaleController.getString(R.string.AutoDownloadPhotos);
            i24 = 1;
        } else {
            i12 = dataAutoDownloadActivity.videosRow;
            if (i9 == i12) {
                string = LocaleController.getString(R.string.AutoDownloadVideos);
                i24 = 4;
            } else {
                i13 = dataAutoDownloadActivity.storiesRow;
                if (i9 == i13) {
                    string = LocaleController.getString(R.string.AutoDownloadStories);
                    j5Var.setDrawLine(false);
                } else {
                    string = LocaleController.getString(R.string.AutoDownloadFiles);
                    i24 = 8;
                }
            }
        }
        if (i21 == 0) {
            i20 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i20).getCurrentMobilePreset();
        } else if (i21 == 1) {
            i15 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i15).getCurrentWiFiPreset();
        } else {
            i14 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i14).getCurrentRoamingPreset();
        }
        long j10 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i24)];
        StringBuilder sb4 = new StringBuilder();
        i16 = dataAutoDownloadActivity.storiesRow;
        if (i9 != i16) {
            int i25 = 0;
            while (true) {
                int[] iArr = currentRoamingPreset.mask;
                if (i25 >= iArr.length) {
                    break;
                }
                if ((iArr[i25] & i24) != 0) {
                    if (sb4.length() != 0) {
                        sb4.append(", ");
                    }
                    if (i25 == 0) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                    } else if (i25 == 1) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                    } else if (i25 == 2) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                    } else if (i25 == 3) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                    }
                    i23++;
                }
                i25++;
            }
            if (i23 == 4) {
                sb4.setLength(0);
                i18 = dataAutoDownloadActivity.photosRow;
                if (i9 == i18) {
                    sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                } else {
                    sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                }
            } else if (i23 == 0) {
                sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
            } else {
                i17 = dataAutoDownloadActivity.photosRow;
                sb2 = i9 == i17 ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j10), sb4.toString()));
                sb3 = sb2;
            }
            sb3 = sb4;
        } else if (currentRoamingPreset.preloadStories) {
            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
            i23 = 1;
        } else {
            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
            sb3 = sb2;
        }
        if (dataAutoDownloadActivity.h) {
            j5Var.setChecked(i23 != 0);
        }
        boolean z10 = i23 != 0;
        i19 = dataAutoDownloadActivity.storiesRow;
        j5Var.b(string, sb3, 0, z10, 0, true, i9 != i19, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 == 0) {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            t8Var.d(org.telegram.ui.ActionBar.f6.g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
            t8Var.setTypeface(AndroidUtilities.bold());
            t8Var.setHeight(56);
            view = t8Var;
        } else if (i9 == 1) {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else if (i9 == 2) {
            view = new org.telegram.ui.Cells.m4(context);
        } else if (i9 != 3) {
            view = i9 != 4 ? new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.j5(context);
        } else {
            org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
            bv0Var.setCallback(new wt(this, 0));
            view = bv0Var;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
