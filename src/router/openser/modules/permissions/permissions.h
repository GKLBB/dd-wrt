/*
 * $Id: permissions.h,v 1.1.1.1 2005/06/13 16:47:43 bogdan_iancu Exp $
 *
 * PERMISSIONS module
 *
 * Copyright (C) 2003 Mikl�s Tirp�k (mtirpak@sztaki.hu)
 *
 * This file is part of openser, a free SIP server.
 *
 * openser is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version
 *
 * openser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License 
 * along with this program; if not, write to the Free Software 
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * History:
 * --------
 *  2003-09-03  replaced /usr/local/et/ser/ with CFG_DIR (andrei)
 */
 
#ifndef PERMISSIONS_H
#define PERMISSIONS_H 1

#include "../../sr_module.h"
#include "../../db/db.h"
#include "rule.h"

#define DEFAULT_ALLOW_FILE "permissions.allow"
#define DEFAULT_DENY_FILE  "permissions.deny"

typedef struct rule_file {
	rule* rules;    /* Parsed rule set */
	char* filename; /* The name of the file */
} rule_file_t;

/*
 * Maximum number if allow/deny file pairs that can be opened
 * at any time
 */
#define MAX_RULE_FILES 64

extern char* db_url;        /* Database URL */
extern int db_mode;	    /* Database usage mode: 0=no cache, 1=cache */
extern char* trusted_table; /* Name of trusted table */
extern char* source_col;    /* Name of source address column */
extern char* proto_col;     /* Name of protocol column */
extern char* from_col;      /* Name of from pattern column */


#define DISABLE_CACHE 0
#define ENABLE_CACHE 1

#endif
