package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ DataAutoDownloadActivity d;

    public yt(DataAutoDownloadActivity dataAutoDownloadActivity, Context context) {
        this.d = dataAutoDownloadActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = n1Var.b();
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i10 = dataAutoDownloadActivity.photosRow;
        if (b10 == i10) {
            return true;
        }
        i11 = dataAutoDownloadActivity.videosRow;
        if (b10 == i11) {
            return true;
        }
        i12 = dataAutoDownloadActivity.filesRow;
        if (b10 == i12) {
            return true;
        }
        i13 = dataAutoDownloadActivity.storiesRow;
        return b10 == i13;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.x;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        i11 = dataAutoDownloadActivity.autoDownloadRow;
        if (i10 == i11) {
            return 0;
        }
        if (i10 == dataAutoDownloadActivity.s) {
            return 1;
        }
        if (i10 == dataAutoDownloadActivity.r || i10 == dataAutoDownloadActivity.v) {
            return 2;
        }
        i12 = dataAutoDownloadActivity.usageProgressRow;
        if (i10 == i12) {
            return 3;
        }
        i13 = dataAutoDownloadActivity.photosRow;
        if (i10 == i13) {
            return 4;
        }
        i14 = dataAutoDownloadActivity.videosRow;
        if (i10 == i14) {
            return 4;
        }
        i15 = dataAutoDownloadActivity.filesRow;
        if (i10 == i15) {
            return 4;
        }
        i16 = dataAutoDownloadActivity.storiesRow;
        return i10 == i16 ? 4 : 5;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String string;
        int i15;
        DownloadController.Preset currentRoamingPreset;
        int i16;
        int i17;
        int i18;
        StringBuilder sb2;
        StringBuilder sb3;
        int i19;
        int i20;
        int i21;
        DataAutoDownloadActivity dataAutoDownloadActivity = this.d;
        int i22 = dataAutoDownloadActivity.f;
        DownloadController.Preset preset = dataAutoDownloadActivity.C;
        int i23 = n1Var.f;
        View view = n1Var.a;
        int i24 = 0;
        if (i23 == 0) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i11 = dataAutoDownloadActivity.autoDownloadRow;
            if (i10 == i11) {
                q8Var.setDrawCheckRipple(true);
                q8Var.f(LocaleController.getString(R.string.AutoDownloadMedia), preset.enabled, false);
                q8Var.setTag(Integer.valueOf(preset.enabled ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6));
                q8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, preset.enabled ? org.telegram.ui.ActionBar.g6.f6 : org.telegram.ui.ActionBar.g6.e6, false));
                return;
            }
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == dataAutoDownloadActivity.r) {
                k4Var.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.v) {
                    k4Var.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                    return;
                }
                return;
            }
        }
        if (i23 == 3) {
            dataAutoDownloadActivity.m0((org.telegram.ui.Components.lv0) view);
            return;
        }
        int i25 = -1;
        if (i23 != 4) {
            if (i23 != 5) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == dataAutoDownloadActivity.w) {
                y8Var.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                y8Var.setFixedSize(0);
                y8Var.setImportantForAccessibility(1);
                return;
            } else {
                if (i10 == dataAutoDownloadActivity.n) {
                    if (dataAutoDownloadActivity.r != -1) {
                        y8Var.setText(null);
                        y8Var.setFixedSize(12);
                        y8Var.setImportantForAccessibility(4);
                        return;
                    }
                    if (i22 == 0) {
                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                    } else if (i22 == 1) {
                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                    } else if (i22 == 2) {
                        y8Var.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                    }
                    y8Var.setImportantForAccessibility(1);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
        h5Var.setDrawLine(true);
        i12 = dataAutoDownloadActivity.photosRow;
        if (i10 == i12) {
            string = LocaleController.getString(R.string.AutoDownloadPhotos);
            i25 = 1;
        } else {
            i13 = dataAutoDownloadActivity.videosRow;
            if (i10 == i13) {
                string = LocaleController.getString(R.string.AutoDownloadVideos);
                i25 = 4;
            } else {
                i14 = dataAutoDownloadActivity.storiesRow;
                if (i10 == i14) {
                    string = LocaleController.getString(R.string.AutoDownloadStories);
                    h5Var.setDrawLine(false);
                } else {
                    string = LocaleController.getString(R.string.AutoDownloadFiles);
                    i25 = 8;
                }
            }
        }
        if (i22 == 0) {
            i21 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i21).getCurrentMobilePreset();
        } else if (i22 == 1) {
            i16 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i16).getCurrentWiFiPreset();
        } else {
            i15 = ((org.telegram.ui.ActionBar.o2) dataAutoDownloadActivity).currentAccount;
            currentRoamingPreset = DownloadController.getInstance(i15).getCurrentRoamingPreset();
        }
        long j10 = currentRoamingPreset.sizes[DownloadController.typeToIndex(i25)];
        StringBuilder sb4 = new StringBuilder();
        i17 = dataAutoDownloadActivity.storiesRow;
        if (i10 != i17) {
            int i26 = 0;
            while (true) {
                int[] iArr = currentRoamingPreset.mask;
                if (i26 >= iArr.length) {
                    break;
                }
                if ((iArr[i26] & i25) != 0) {
                    if (sb4.length() != 0) {
                        sb4.append(", ");
                    }
                    if (i26 == 0) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadContacts));
                    } else if (i26 == 1) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadPm));
                    } else if (i26 == 2) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadGroups));
                    } else if (i26 == 3) {
                        sb4.append(LocaleController.getString(R.string.AutoDownloadChannels));
                    }
                    i24++;
                }
                i26++;
            }
            if (i24 == 4) {
                sb4.setLength(0);
                i19 = dataAutoDownloadActivity.photosRow;
                if (i10 == i19) {
                    sb4.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                } else {
                    sb4.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j10)));
                }
            } else if (i24 == 0) {
                sb4.append(LocaleController.getString(R.string.AutoDownloadOff));
            } else {
                i18 = dataAutoDownloadActivity.photosRow;
                sb2 = i10 == i18 ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb4.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j10), sb4.toString()));
                sb3 = sb2;
            }
            sb3 = sb4;
        } else if (currentRoamingPreset.preloadStories) {
            sb3 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb4.toString()));
            i24 = 1;
        } else {
            sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb4.toString()));
            sb3 = sb2;
        }
        if (dataAutoDownloadActivity.h) {
            h5Var.setChecked(i24 != 0);
        }
        boolean z10 = i24 != 0;
        i20 = dataAutoDownloadActivity.storiesRow;
        h5Var.b(string, sb3, 0, z10, 0, true, i10 != i20, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            q8Var.d(org.telegram.ui.ActionBar.g6.g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
            q8Var.setTypeface(AndroidUtilities.bold());
            q8Var.setHeight(56);
            view = q8Var;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.x6(context, (b) null);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.k4(context);
        } else if (i10 != 3) {
            view = i10 != 4 ? new org.telegram.ui.Cells.y8(context) : new org.telegram.ui.Cells.h5(context);
        } else {
            org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
            lv0Var.setCallback(new xt(this, 0));
            view = lv0Var;
        }
        return th.m(view, view, -1, -2);
    }
}
